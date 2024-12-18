/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/

package org.pentaho.metastore.test.testclasses.cube;

import org.pentaho.metastore.persist.MetaStoreAttribute;

public class DimensionAttribute {

  @MetaStoreAttribute
  private String name;

  @MetaStoreAttribute
  private String description;

  @MetaStoreAttribute
  private String someOtherStuff;

  public DimensionAttribute() {
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName( String name ) {
    this.name = name;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription( String description ) {
    this.description = description;
  }

  /**
   * @return the someOtherStuff
   */
  public String getSomeOtherStuff() {
    return someOtherStuff;
  }

  /**
   * @param someOtherStuff the someOtherStuff to set
   */
  public void setSomeOtherStuff( String someOtherStuff ) {
    this.someOtherStuff = someOtherStuff;
  }
}
