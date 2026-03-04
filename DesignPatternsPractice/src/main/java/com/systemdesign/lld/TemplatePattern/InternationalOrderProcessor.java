package com.systemdesign.lld.TemplatePattern;

public class InternationalOrderProcessor extends OrderProcessor {

    @Override
    protected void validateOrder() {
        System.out.println("Validating international order details, including customs information.");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing payment for international order with currency conversion.");
    }

    @Override
    protected void arrangeShipping() {
        System.out.println("Arranging international shipping with customs clearance.");
        System.out.println("Extra packuging and documentation may be required for international orders. Please ensure all necessary information is provided.");
    }

    @Override
    protected void sendConfirmation() {
        System.out.println("Sending international order confirmation email with tracking details.");
        System.out.println("Note: International orders may take longer to process and deliver.");
    }
}
