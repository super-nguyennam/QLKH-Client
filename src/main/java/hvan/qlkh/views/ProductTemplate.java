/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hvan.qlkh.views;

import hvan.qlkh.models.Product;
import hvan.qlkh.utils.Panel;
import hvan.qlkh.utils.ScrollBar;
import java.awt.Color;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static javax.swing.ScrollPaneConstants.UPPER_RIGHT_CORNER;

/**
 *
 * @author Nguyễn Phan Hoài Nam
 */

public class ProductTemplate extends javax.swing.JPanel {

    private Product product;

    @SuppressWarnings("deprecation")
    Locale vn = new Locale("vi", "VN");
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(vn);
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private void initScroll(){
        template__Scroll.setBorder(null);
        template__Scroll.setVerticalScrollBar(new ScrollBar());
        template__Scroll.getVerticalScrollBar().setBackground(Color.WHITE);
        template__Scroll.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(new Color(246,251,249));
        template__Scroll.setCorner(UPPER_RIGHT_CORNER, p);
    }

    private void setData(){
        if (product != null){
            template__Name.setText("<html><div style=\"width: 140px; text-align: center; color: #32403B; font-size: 18px; font-family: Karla; font-weight: 500; line-height: 20px; word-wrap: break-word\">" + product.getName() +"</div></html>");
            template__ID.setText("<html><div style=\"width: 80px; text-align: left; color:#D43A02; font-size: 12px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">" + product.getId() + "</div></htm");
            template__Quantity.setText("<html><div style=\"width: 80px; text-align: left; color:#94D82D; font-size: 12px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">" + product.getQuantity() + "</div></htm");
            template__Price.setText("<html><div style=\"width: 80px; text-align: left; color:orange; font-size: 12px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">" + currencyFormat.format(product.getPrice()) + "</div></htm");
            template__Expiry.setText("<html><div style=\"width: 80px; text-align: left; color:#CC5DE8; font-size: 12px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">" + dateFormat.format(product.getExpDate()) + "</div></htm");
            template__Category.setText("<html><div style=\"width: 80px; text-align: left; color:#5C7CFA; font-size: 10px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">" + product.getCategory() + "</div></htm");
            template__Manafacturer.setText("<html><div style=\"width: 80px; text-align: left; color:#FA5252; font-size: 10px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">" + product.getManafacturer() + "</div></htm");
            if (product.getThumbnail() != null){
                if (!product.getThumbnail().equals("")){
                    try {
                        template__Thumbnail.setIcon(new ImageIcon(product.getThumbnail()));
                    } catch (Exception e) {
                    }
                }
            }
            template__Description.setText(product.getDescription());
        }
    }

    public ProductTemplate(Product product) {
        this.product = product;
        initComponents();
        initScroll();
        setData();
        template__Description.setCaretPosition(0);
        template__Scroll.getVerticalScrollBar().setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        template = new Panel(35);
        template__ID = new javax.swing.JLabel();
        template__Thumbnail = new javax.swing.JLabel();
        template__Price = new javax.swing.JLabel();
        template__Name = new javax.swing.JLabel();
        template__IDTitle = new javax.swing.JLabel();
        template__PriceTitle = new javax.swing.JLabel();
        template__ExpiryTitle = new javax.swing.JLabel();
        template__Expiry = new javax.swing.JLabel();
        template__QuantityTitle = new javax.swing.JLabel();
        template__Quantity = new javax.swing.JLabel();
        template__Scroll = new javax.swing.JScrollPane();
        template__Description = new javax.swing.JTextPane();
        template__CategoryTitle = new javax.swing.JLabel();
        template__ManafacturerTitle = new javax.swing.JLabel();
        template__Category = new javax.swing.JLabel();
        template__Manafacturer = new javax.swing.JLabel();
        template__DescriptionTitle = new javax.swing.JLabel();

        setOpaque(false);

        template.setBackground(new java.awt.Color(255, 255, 255));
        template.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        template.setPreferredSize(new java.awt.Dimension(350, 400));

        template__ID.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        template__ID.setForeground(new java.awt.Color(101, 168, 68));
        template__ID.setText("<html><div style=\"width: 80px; text-align: left; color:#D43A02; font-size: 12px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\"></div></htm");
        template__ID.setPreferredSize(new java.awt.Dimension(100, 20));

        template__Thumbnail.setBackground(new java.awt.Color(255, 255, 255));
        template__Thumbnail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        template__Thumbnail.setOpaque(true);
        template__Thumbnail.setPreferredSize(new java.awt.Dimension(140, 180));

        template__Price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        template__Price.setForeground(new java.awt.Color(252, 140, 25));
        template__Price.setText("<html><div style=\"width: 80px; text-align: left; color:orange; font-size: 12px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\"></div></htm");
        template__Price.setPreferredSize(new java.awt.Dimension(100, 20));

        template__Name.setText("<html><div style=\"width: 140px; text-align: center; color: #32403B; font-size: 18px; font-family: Karla; font-weight: 500; line-height: 20px; word-wrap: break-word\"></div></html>");
        template__Name.setPreferredSize(new java.awt.Dimension(175, 20));

        template__IDTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        template__IDTitle.setForeground(new Color(0, 0, 0, 100)
        );
        template__IDTitle.setText("<html><div style=\"width: 80px; text-align: left; color:rgba(33, 43, 39, 0.8); font-size: 8px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">Mã số:</div></htm");
        template__IDTitle.setPreferredSize(new java.awt.Dimension(70, 20));

        template__PriceTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        template__PriceTitle.setForeground(new Color(0, 0, 0, 100)
        );
        template__PriceTitle.setText("<html><div style=\"width: 80px; text-align: left; color:rgba(33, 43, 39, 0.8); font-size: 8px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">Đơn giá:</div></htm");
        template__PriceTitle.setPreferredSize(new java.awt.Dimension(70, 20));

        template__ExpiryTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        template__ExpiryTitle.setForeground(new Color(0, 0, 0, 100)
        );
        template__ExpiryTitle.setText("<html><div style=\"width: 80px; text-align: left; color:rgba(33, 43, 39, 0.8); font-size: 8px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">HSD:</div></htm");
        template__ExpiryTitle.setPreferredSize(new java.awt.Dimension(70, 20));

        template__Expiry.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        template__Expiry.setForeground(new java.awt.Color(250, 82, 82));
        template__Expiry.setText("<html><div style=\"width: 80px; text-align: left; color:#CC5DE8; font-size: 12px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\"></div></htm");
        template__Expiry.setPreferredSize(new java.awt.Dimension(100, 20));

        template__QuantityTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        template__QuantityTitle.setForeground(new Color(0, 0, 0, 100)
        );
        template__QuantityTitle.setText("<html><div style=\"width: 80px; text-align: left; color:rgba(33, 43, 39, 0.8); font-size: 8px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">SL:</div></htm");
        template__QuantityTitle.setPreferredSize(new java.awt.Dimension(70, 20));

        template__Quantity.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        template__Quantity.setForeground(new java.awt.Color(96, 141, 229));
        template__Quantity.setText("<html><div style=\"width: 80px; text-align: left; color:#94D82D; font-size: 12px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\"></div></htm");
        template__Quantity.setPreferredSize(new java.awt.Dimension(100, 20));

        template__Scroll.setBorder(null);
        template__Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        template__Scroll.setOpaque(false);
        template__Scroll.setPreferredSize(new java.awt.Dimension(320, 145));

        template__Description.setEditable(false);
        template__Description.setBorder(null);
        template__Description.setSelectionColor(new java.awt.Color(255, 255, 255));
        template__Scroll.setViewportView(template__Description);

        template__CategoryTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        template__CategoryTitle.setForeground(new Color(0, 0, 0, 100)
        );
        template__CategoryTitle.setText("<html><div style=\"width: 80px; text-align: left; color:rgba(33, 43, 39, 0.8); font-size: 8px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">Danh mục:</div></htm");
        template__CategoryTitle.setPreferredSize(new java.awt.Dimension(70, 20));

        template__ManafacturerTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        template__ManafacturerTitle.setForeground(new Color(0, 0, 0, 100)
        );
        template__ManafacturerTitle.setText("<html><div style=\"width: 80px; text-align: left; color:rgba(33, 43, 39, 0.8); font-size: 8px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">Nhà sản xuất:</div></htm");
        template__ManafacturerTitle.setPreferredSize(new java.awt.Dimension(70, 20));

        template__Category.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        template__Category.setForeground(new java.awt.Color(101, 168, 68));
        template__Category.setText("<html><div style=\"width: 80px; text-align: left; color:#5C7CFA; font-size: 10px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\"></div></htm");
        template__Category.setPreferredSize(new java.awt.Dimension(100, 20));

        template__Manafacturer.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        template__Manafacturer.setForeground(new java.awt.Color(101, 168, 68));
        template__Manafacturer.setText("<html><div style=\"width: 80px; text-align: left; color:#FA5252; font-size: 10px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\"></div></htm");
        template__Manafacturer.setPreferredSize(new java.awt.Dimension(115, 20));

        template__DescriptionTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        template__DescriptionTitle.setForeground(new Color(0, 0, 0, 100)
        );
        template__DescriptionTitle.setText("<html><div style=\"width: 80px; text-align: left; color:rgba(33, 43, 39, 0.8); font-size: 8px; font-family: Karla; font-weight: 500; line-height: 15px; word-wrap: break-word\">Mô tả:</div></htm");
        template__DescriptionTitle.setPreferredSize(new java.awt.Dimension(70, 20));

        javax.swing.GroupLayout templateLayout = new javax.swing.GroupLayout(template);
        template.setLayout(templateLayout);
        templateLayout.setHorizontalGroup(
            templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(templateLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(templateLayout.createSequentialGroup()
                        .addComponent(template__Thumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(templateLayout.createSequentialGroup()
                                .addComponent(template__ExpiryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(template__Expiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(templateLayout.createSequentialGroup()
                                .addComponent(template__CategoryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(template__Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(templateLayout.createSequentialGroup()
                                .addComponent(template__ManafacturerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(template__Manafacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(template__Name, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(templateLayout.createSequentialGroup()
                                .addComponent(template__IDTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(template__ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(templateLayout.createSequentialGroup()
                                .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(template__PriceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(template__QuantityTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(template__Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(template__Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(templateLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(template__Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(template__DescriptionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        templateLayout.setVerticalGroup(
            templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(templateLayout.createSequentialGroup()
                .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(templateLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(template__Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(template__ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(template__IDTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(template__QuantityTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(template__Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(template__PriceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(template__Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(template__Expiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(template__ExpiryTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(template__CategoryTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(template__Category, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(templateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(template__ManafacturerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(template__Manafacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, templateLayout.createSequentialGroup()
                        .addComponent(template__Thumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(template__DescriptionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(template__Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(template, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(template, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel template;
    private javax.swing.JLabel template__Category;
    private javax.swing.JLabel template__CategoryTitle;
    private javax.swing.JTextPane template__Description;
    private javax.swing.JLabel template__DescriptionTitle;
    private javax.swing.JLabel template__Expiry;
    private javax.swing.JLabel template__ExpiryTitle;
    private javax.swing.JLabel template__ID;
    private javax.swing.JLabel template__IDTitle;
    private javax.swing.JLabel template__Manafacturer;
    private javax.swing.JLabel template__ManafacturerTitle;
    private javax.swing.JLabel template__Name;
    private javax.swing.JLabel template__Price;
    private javax.swing.JLabel template__PriceTitle;
    private javax.swing.JLabel template__Quantity;
    private javax.swing.JLabel template__QuantityTitle;
    private javax.swing.JScrollPane template__Scroll;
    private javax.swing.JLabel template__Thumbnail;
    // End of variables declaration//GEN-END:variables
}
