package br.com.rns.repository.implement;

import br.com.rns.model.Invoice;
import br.com.rns.repository.InvoiceRepository;
import br.com.rns.service.ServiceInvoice;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceInvoiceImplement implements ServiceInvoice {
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public void saveInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);

    }
}
