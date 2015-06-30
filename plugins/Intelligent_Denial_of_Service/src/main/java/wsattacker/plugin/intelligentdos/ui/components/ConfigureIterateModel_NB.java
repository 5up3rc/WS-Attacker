/**
 * WS-Attacker - A Modular Web Services Penetration Testing Framework Copyright
 * (C) 2013 Christian Altmeier
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package wsattacker.plugin.intelligentdos.ui.components;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

import wsattacker.library.intelligentdos.helper.IterateModel.IterateStrategie;
import wsattacker.plugin.intelligentdos.ui.helper.JTextFieldInteger;

/**
 * @author Christian Altmeier
 */
public class ConfigureIterateModel_NB
    extends javax.swing.JPanel
{

    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport( this );

    private String startAt;

    private String stopAt;

    private String increment;

    private IterateStrategie iterateStrategie;

    /**
     * Creates new form ConfigureIterateModel_NB
     */
    public ConfigureIterateModel_NB()
    {
        initComponents();

        jTextField1.setDocument( new JTextFieldInteger() );
        jTextField2.setDocument( new JTextFieldInteger() );
        jTextField3.setDocument( new JTextFieldInteger() );
        jComboBox1.setModel( getComboBoxModel() );
    }

    private ComboBoxModel getComboBoxModel()
    {
        IterateStrategie[] items = IterateStrategie.values();
        return new DefaultComboBoxModel( items );
    }

    @Override
    public void addPropertyChangeListener( PropertyChangeListener listener )
    {
        changeSupport.addPropertyChangeListener( listener );
    }

    @Override
    public void removePropertyChangeListener( PropertyChangeListener listener )
    {
        changeSupport.removePropertyChangeListener( listener );
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        jLabel1.setText( "Value to start at" );

        jTextField1.setHorizontalAlignment( javax.swing.JTextField.RIGHT );

        org.jdesktop.beansbinding.Binding binding =
            org.jdesktop.beansbinding.Bindings.createAutoBinding( org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
                                                                  this,
                                                                  org.jdesktop.beansbinding.ELProperty.create( "${startAt}" ),
                                                                  jTextField1,
                                                                  org.jdesktop.beansbinding.BeanProperty.create( "text" ) );
        bindingGroup.addBinding( binding );

        jLabel2.setText( "Value to stop at" );

        jTextField2.setHorizontalAlignment( javax.swing.JTextField.RIGHT );

        binding =
            org.jdesktop.beansbinding.Bindings.createAutoBinding( org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
                                                                  this,
                                                                  org.jdesktop.beansbinding.ELProperty.create( "${stopAt}" ),
                                                                  jTextField2,
                                                                  org.jdesktop.beansbinding.BeanProperty.create( "text" ) );
        bindingGroup.addBinding( binding );

        jLabel3.setText( "Value to iterate" );

        jTextField3.setHorizontalAlignment( javax.swing.JTextField.RIGHT );

        binding =
            org.jdesktop.beansbinding.Bindings.createAutoBinding( org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
                                                                  this,
                                                                  org.jdesktop.beansbinding.ELProperty.create( "${increment}" ),
                                                                  jTextField3,
                                                                  org.jdesktop.beansbinding.BeanProperty.create( "text" ) );
        bindingGroup.addBinding( binding );

        jLabel4.setText( "Iteratemodel" );

        jComboBox1.setModel( new javax.swing.DefaultComboBoxModel( new String[] { "Item 1", "Item 2", "Item 3",
            "Item 4" } ) );

        binding =
            org.jdesktop.beansbinding.Bindings.createAutoBinding( org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
                                                                  this,
                                                                  org.jdesktop.beansbinding.ELProperty.create( "${iterateStrategie}" ),
                                                                  jComboBox1,
                                                                  org.jdesktop.beansbinding.BeanProperty.create( "selectedItem" ) );
        bindingGroup.addBinding( binding );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( this );
        this.setLayout( layout );
        layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap().addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( jLabel2 ).addComponent( jLabel3 ).addComponent( jLabel4 ).addComponent( jLabel1 ) ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addGap( 26,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             26,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             26 ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( jTextField3,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  91,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  Short.MAX_VALUE ).addComponent( jTextField2,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  javax.swing.GroupLayout.Alignment.TRAILING ).addComponent( jTextField1 ) ) ).addGroup( javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         layout.createSequentialGroup().addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         Short.MAX_VALUE ).addComponent( jComboBox1,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         91,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         javax.swing.GroupLayout.PREFERRED_SIZE ) ) ).addContainerGap() ) );
        layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap().addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( jLabel1 ).addComponent( jTextField1,
                                                                                                                                                                                                                                                                                             javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                             javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                             javax.swing.GroupLayout.PREFERRED_SIZE ) ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( jLabel2 ).addComponent( jTextField2,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE ) ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( jLabel3 ).addComponent( jTextField3,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 javax.swing.GroupLayout.PREFERRED_SIZE ) ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( jLabel4 ).addComponent( jComboBox1,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           javax.swing.GroupLayout.PREFERRED_SIZE ) ).addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       Short.MAX_VALUE ) ) );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JTextField jTextField1;

    private javax.swing.JTextField jTextField2;

    private javax.swing.JTextField jTextField3;

    private transient org.jdesktop.beansbinding.BindingGroup bindingGroup;

    // End of variables declaration//GEN-END:variables

    /**
     * @return the startAt
     */
    public String getStartAt()
    {
        return startAt;
    }

    /**
     * @param startAt the startAt to set
     */
    public void setStartAt( String startAt )
    {
        String old = this.startAt;
        this.startAt = startAt;
        changeSupport.firePropertyChange( "startAt", old, startAt );
    }

    /**
     * @return the stopAt
     */
    public String getStopAt()
    {
        return stopAt;
    }

    /**
     * @param stopAt the stopAt to set
     */
    public void setStopAt( String stopAt )
    {
        String old = this.stopAt;
        this.stopAt = stopAt;
        changeSupport.firePropertyChange( "stopAt", old, stopAt );
    }

    /**
     * @return the increment
     */
    public String getIncrement()
    {
        return increment;
    }

    /**
     * @param increment the increment to set
     */
    public void setIncrement( String increment )
    {
        String old = this.increment;
        this.increment = increment;
        changeSupport.firePropertyChange( "increment", old, increment );
    }

    /**
     * @return the iterateStrategie
     */
    public IterateStrategie getIterateStrategie()
    {
        return iterateStrategie;
    }

    /**
     * @param iterateStrategie the iterateStrategie to set
     */
    public void setIterateStrategie( IterateStrategie iterateStrategie )
    {
        IterateStrategie old = this.iterateStrategie;
        this.iterateStrategie = iterateStrategie;
        changeSupport.firePropertyChange( "iterateStrategie", old, iterateStrategie );
    }
}