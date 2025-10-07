package br.edu.cefsa.organizatec.dao;

import br.edu.cefsa.organizatec.model.Terceirizado;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TerceirizadoDAO {

    private final JdbcTemplate jdbc;

    public TerceirizadoDAO(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    private static class TerceirizadoMapper implements RowMapper<Terceirizado> {
        @Override
        public Terceirizado mapRow(ResultSet rs, int rowNum) throws SQLException {
            Terceirizado f = new Terceirizado();
            f.setId(rs.getInt("id"));
            f.setNome(rs.getString("nome"));
            f.setCpf(rs.getString("cpf"));
            f.setDataNascimento(rs.getDate("data_nascimento").toLocalDate());
            f.setFuncao(rs.getString("funcao"));
            f.setEmpresaPrestadora(rs.getString("cargo"));
            f.setDataInicioContrato(rs.getDate("data_inicio_contrato").toLocalDate());
            f.setDataFimContrato(rs.getDate("data_fim_contrato").toLocalDate());
            f.setResponsavelInterno(rs.getString("responsavel_interno"));
            return f;
        }
    }

    public List<Terceirizado> listar() {
        String sql = "SELECT * FROM terceirizado";
        return jdbc.query(sql, new TerceirizadoMapper());
    }

    public Terceirizado buscarPorId(Integer id) {
        String sql = "SELECT * FROM terceirizado WHERE id = ?";
        return jdbc.queryForObject(sql, new TerceirizadoMapper(), id);
    }

    public int salvar(Terceirizado f) {
        String sql = """
            INSERT INTO terceirizado
            (nome, cpf, data_nascimento, matricula, cargo, salario_base, data_contratacao, departamento_id)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?)
            """;
        return jdbc.update(sql, f.getNome(), f.getCpf(), f.getDataNascimento(),
                f.getMatricula(), f.getCargo(), f.getSalarioBase(),
                f.getDataContratacao(), f.getDepartamentoId());
    }

    public int atualizar(Terceirizado f) {
        String sql = """
            UPDATE terceirizado SET nome=?, cpf=?, data_nascimento=?, matricula=?, 
            cargo=?, salario_base=?, data_contratacao=?, departamento_id=? WHERE id=?
            """;
        return jdbc.update(sql, f.getNome(), f.getCpf(), f.getDataNascimento(),
                f.getMatricula(), f.getCargo(), f.getSalarioBase(),
                f.getDataContratacao(), f.getDepartamentoId(), f.getId());
    }

    public int excluir(Integer id) {
        String sql = "DELETE FROM terceirizado WHERE id=?";
        return jdbc.update(sql, id);
    }
}
