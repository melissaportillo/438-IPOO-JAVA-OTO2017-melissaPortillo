package com.melissaportillo.ipoo.repuestos.storage;

import com.melissaportillo.ipoo.repuestos.cliente.Cliente;

public interface Storage {
	
	Cliente obtCliente(String tipoDoc, String nroDoc, String password);

}