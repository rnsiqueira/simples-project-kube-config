package br.com.rns.service;

import br.com.rns.model.Invoice;
import org.springframework.stereotype.Service;

@Service
public interface ServiceInvoice {

    void saveInvoice(Invoice invoice);


}
