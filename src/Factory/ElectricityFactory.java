/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author MScIT17
 */
public class ElectricityFactory {
    private DomesticBill bill_Domestic = null;
    private InstitutionalBill bill_Institute = null;
    private CommercialBill bill_Commercial = null;
        
    public void GenerateElectricityBill(int BillType, int units){
        Bill billInstance = null;
        switch(BillType){
            case 1:
                if(bill_Domestic == null)
                    bill_Domestic = new DomesticBill();

                billInstance = bill_Domestic;
                break;

            case 2:
                 if(bill_Institute == null)
                    bill_Institute = new InstitutionalBill();

                billInstance = bill_Institute;
                break;

            case 3:
                 if(bill_Commercial == null)
                    bill_Commercial = new CommercialBill();

                billInstance = bill_Commercial;
                break;

            default:
                System.out.print("Bill type not found");
        }
        
        if(billInstance != null)
            System.out.println("Bill amount is : " +  billInstance.getBillTotal(units));
    }
}
