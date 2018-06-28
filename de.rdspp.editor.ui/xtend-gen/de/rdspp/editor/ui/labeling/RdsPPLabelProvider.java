/**
 * generated by Xtext 2.12.0
 */
package de.rdspp.editor.ui.labeling;

import com.google.inject.Inject;
import de.rdspp.editor.rdsPP.CommonAssignment;
import de.rdspp.editor.rdsPP.ConnectionIdentification;
import de.rdspp.editor.rdsPP.DocumentIdentification;
import de.rdspp.editor.rdsPP.FunctionalAssignment;
import de.rdspp.editor.rdsPP.FunctionalDesignation;
import de.rdspp.editor.rdsPP.InstallationLocationDescription;
import de.rdspp.editor.rdsPP.LocationDescription;
import de.rdspp.editor.rdsPP.ProductDescription;
import de.rdspp.editor.rdsPP.SignalIdentification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class RdsPPLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public RdsPPLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  @Override
  public Object text(final Object ele) {
    Object _xifexpression = null;
    if ((ele instanceof LocationDescription)) {
      String _xblockexpression = null;
      {
        final LocationDescription castedEle = ((LocationDescription) ele);
        _xblockexpression = this.setText(castedEle.getDescription(), "\n Aufstellungsortkennzeichnung: \n");
      }
      _xifexpression = _xblockexpression;
    } else {
      Object _xifexpression_1 = null;
      if ((ele instanceof CommonAssignment)) {
        String _xblockexpression_1 = null;
        {
          final CommonAssignment castedEle = ((CommonAssignment) ele);
          _xblockexpression_1 = this.setText(castedEle.getDescription(), "\n Gemeinsame Zuordnung: \n");
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        Object _xifexpression_2 = null;
        if ((ele instanceof ProductDescription)) {
          String _xblockexpression_2 = null;
          {
            final ProductDescription castedEle = ((ProductDescription) ele);
            _xblockexpression_2 = this.setText(castedEle.getDescription(), "\n Produktbezogene Kennzeichnung: \n");
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          Object _xifexpression_3 = null;
          if ((ele instanceof InstallationLocationDescription)) {
            String _xblockexpression_3 = null;
            {
              final InstallationLocationDescription castedEle = ((InstallationLocationDescription) ele);
              _xblockexpression_3 = this.setText(castedEle.getDescription(), "\n Einbauort Kennzeichnung: \n");
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            Object _xifexpression_4 = null;
            if ((ele instanceof FunctionalDesignation)) {
              String _xblockexpression_4 = null;
              {
                final FunctionalDesignation castedEle = ((FunctionalDesignation) ele);
                _xblockexpression_4 = this.setText(castedEle.getDescription(), "\n Funktionsbezogene Kennzeichnung: \n");
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              Object _xifexpression_5 = null;
              if ((ele instanceof FunctionalAssignment)) {
                String _xblockexpression_5 = null;
                {
                  final FunctionalAssignment castedEle = ((FunctionalAssignment) ele);
                  _xblockexpression_5 = this.setText(castedEle.getDescription(), "\n Funktionale Zuordnung: \n");
                }
                _xifexpression_5 = _xblockexpression_5;
              } else {
                Object _xifexpression_6 = null;
                if ((ele instanceof SignalIdentification)) {
                  String _xblockexpression_6 = null;
                  {
                    final SignalIdentification castedEle = ((SignalIdentification) ele);
                    _xblockexpression_6 = this.setText(castedEle.getDescription(), "\n Signalkennzeichnung: \n");
                  }
                  _xifexpression_6 = _xblockexpression_6;
                } else {
                  Object _xifexpression_7 = null;
                  if ((ele instanceof DocumentIdentification)) {
                    String _xblockexpression_7 = null;
                    {
                      final DocumentIdentification castedEle = ((DocumentIdentification) ele);
                      _xblockexpression_7 = this.setText(castedEle.getDescription(), "\n Dokumentenkennzeichnung: \n");
                    }
                    _xifexpression_7 = _xblockexpression_7;
                  } else {
                    Object _xifexpression_8 = null;
                    if ((ele instanceof ConnectionIdentification)) {
                      String _xblockexpression_8 = null;
                      {
                        final ConnectionIdentification castedEle = ((ConnectionIdentification) ele);
                        _xblockexpression_8 = this.setText(castedEle.getDescription(), "\n Anschlusskennzeichnung: \n");
                      }
                      _xifexpression_8 = _xblockexpression_8;
                    } else {
                      _xifexpression_8 = super.text(ele);
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String setText(final String description, final String designation) {
    if ((description != null)) {
      return (designation + description);
    } else {
      return designation;
    }
  }
}
