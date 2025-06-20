package com.desafio.credito.controller;

/*
 * import com.desafio.credito.dto.CreditoDTO; import
 * com.desafio.credito.exception.GlobalExceptionHandler; import
 * com.desafio.credito.service.CreditoService; import io.swagger.v3.oas.annotations.Operation;
 * import io.swagger.v3.oas.annotations.Parameter; import
 * io.swagger.v3.oas.annotations.media.Content; import io.swagger.v3.oas.annotations.media.Schema;
 * import io.swagger.v3.oas.annotations.responses.ApiResponse; import
 * io.swagger.v3.oas.annotations.responses.ApiResponses; import
 * io.swagger.v3.oas.annotations.tags.Tag; import jakarta.validation.constraints.NotBlank; import
 * lombok.RequiredArgsConstructor; import org.springframework.http.MediaType; import
 * org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*;
 * 
 * import java.util.List;
 * 
 * @RestController
 * 
 * @RequestMapping("/api/creditosBack")
 * 
 * @CrossOrigin(origins = "*")
 * 
 * @RequiredArgsConstructor
 * 
 * @Tag(name = "Créditos", description = "API para gerenciamento de créditos fiscais") public class
 * CreditoControllerBack {
 * 
 * /*private final CreditoService creditoService;
 * 
 * @Operation(summary = "Buscar créditos por número da NFS-e", description =
 * "Retorna uma lista de créditos constituídos associados a um número específico de Nota Fiscal de Serviço Eletrônica."
 * )
 * 
 * @ApiResponses(value = {
 * 
 * @ApiResponse(responseCode = "200", description =
 * "Créditos encontrados com sucesso (pode ser uma lista vazia).", content = @Content(mediaType =
 * MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = CreditoDTO.class))),
 * 
 * @ApiResponse(responseCode = "400", description = "Número da NFS-e inválido (ex: em branco).",
 * content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation
 * = GlobalExceptionHandler.ErrorResponse.class))),
 * 
 * @ApiResponse(responseCode = "500", description = "Erro interno no servidor.", content
 * = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation =
 * GlobalExceptionHandler.ErrorResponse.class))) })
 * 
 * @GetMapping("/{numeroNfse}") public ResponseEntity<List<CreditoDTO>>
 * buscarCreditosPorNfse(@PathVariable String numeroNfse) { if (numeroNfse == null ||
 * numeroNfse.trim().isEmpty()) { throw new
 * IllegalArgumentException("Número da NFS-e é obrigatório"); }
 * 
 * List<CreditoDTO> creditos = creditoService.buscarCreditosPorNfse(numeroNfse); return
 * ResponseEntity.ok(creditos); }
 * 
 * @Operation(summary = "Buscar crédito por número do crédito", description =
 * "Retorna os detalhes de um crédito constituído específico, identificado pelo seu número.")
 * 
 * @ApiResponses(value = {
 * 
 * @ApiResponse(responseCode = "200", description = "Crédito encontrado com sucesso.", content
 * = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation =
 * CreditoDTO.class))),
 * 
 * @ApiResponse(responseCode = "400", description = "Número do crédito inválido (ex: em branco).",
 * content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation
 * = GlobalExceptionHandler.ErrorResponse.class))),
 * 
 * @ApiResponse(responseCode = "404", description = "Crédito não encontrado.", content
 * = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation =
 * GlobalExceptionHandler.ErrorResponse.class))),
 * 
 * @ApiResponse(responseCode = "500", description = "Erro interno no servidor.", content
 * = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation =
 * GlobalExceptionHandler.ErrorResponse.class))) })
 * 
 * @GetMapping("/credito/{numeroCredito}") public ResponseEntity<CreditoDTO> buscarCreditoPorNumero(
 * 
 * @Parameter(description = "Número único do crédito para busca.", required = true, example =
 * "CREDITOXYZ789")
 * 
 * @PathVariable @NotBlank(message = "Número do crédito é obrigatório") String numeroCredito) {
 * CreditoDTO credito = creditoService.buscarCreditoPorNumero(numeroCredito); return
 * ResponseEntity.ok(credito); }
 * 
 * @Operation(summary = "Verificar saúde da API", description =
 * "Endpoint simples para verificar se a API de Créditos está operacional.")
 * 
 * @ApiResponses(value = {
 * 
 * @ApiResponse(responseCode = "200", description = "API funcionando.", content = @Content(mediaType
 * = MediaType.TEXT_PLAIN_VALUE, schema = @Schema(type = "string", example =
 * "API de Créditos funcionando!"))) })
 * 
 * @GetMapping("/health") public ResponseEntity<String> health() { return
 * ResponseEntity.ok("API de Créditos funcionando!"); } }
 */
