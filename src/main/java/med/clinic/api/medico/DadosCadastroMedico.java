package med.clinic.api.medico;

import med.clinic.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm,
		Especialidade especialidade, DadosEndereco endereco) {

}
