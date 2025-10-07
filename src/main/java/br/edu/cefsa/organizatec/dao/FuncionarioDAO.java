package br.edu.cefsa.organizatec.dao;

import br.edu.cefsa.organizatec.model.Funcionario;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class FuncionarioDAO {

    private final JdbcTemplate jdbc;

    public FuncionarioDAO(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    private static class FuncionarioMapper implements RowMapper<Funcionario> {
        @Override
        public Funcionario mapRow(ResultSet rs, int rowNum) throws SQLException {
            Funcionario f = new Funcionario();
            f.setId(rs.getInt("id"));
            f.setNome(rs.getString("nome"));
            f.setCpf(rs.getString("cpf"));
            f.setDataNascimento(rs.getDate("data_nascimento").toLocalDate());
            f.setMatricula(rs.getString("matricula"));
            f.setCargo(rs.getString("cargo"));
            f.setSalarioBase(rs.getDouble("salario_base"));
            f.setDataContratacao(rs.getDate("data_contratacao").toLocalDate());
            f.setDepartamentoId(rs.getInt("departamento_id"));
            return f;
        }
    }

    public List<Funcionario> listar() {
        String sql = "SELECT * FROM funcionario";
        return jdbc.query(sql, new FuncionarioMapper());
    }

    public Funcionario buscarPorId(Integer id) {
        String sql = "SELECT * FROM funcionario WHERE id = ?";
        return jdbc.queryForObject(sql, new FuncionarioMapper(), id);
    }

    public int salvar(Funcionario f) {
        String sql = """
            INSERT INTO funcionario
            (nome, cpf, data_nascimento, matricula, cargo, salario_base, data_contratacao, departamento_id)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?)
            """;
        return jdbc.update(sql, f.getNome(), f.getCpf(), f.getDataNascimento(),
                f.getMatricula(), f.getCargo(), f.getSalarioBase(),
                f.getDataContratacao(), f.getDepartamentoId());
    }

    public int atualizar(Funcionario f) {
        String sql = """
            UPDATE funcionario SET nome=?, cpf=?, data_nascimento=?, matricula=?, 
            cargo=?, salario_base=?, data_contratacao=?, departamento_id=? WHERE id=?
            """;
        return jdbc.update(sql, f.getNome(), f.getCpf(), f.getDataNascimento(),
                f.getMatricula(), f.getCargo(), f.getSalarioBase(),
                f.getDataContratacao(), f.getDepartamentoId(), f.getId());
    }

    public int excluir(Integer id) {
        String sql = "DELETE FROM funcionario WHERE id=?";
        return jdbc.update(sql, id);
    }
}
