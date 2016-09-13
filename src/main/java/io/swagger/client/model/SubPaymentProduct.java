/**
 * LIO - Order Management API
 * API de gerenciamento de pedidos da LIO.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Produto secundário.
 **/
@ApiModel(description = "Produto secundário.")
public class SubPaymentProduct  {
  
  @SerializedName("number")
  private Integer number = null;
  @SerializedName("name")
  private String name = null;

  /**
   * Identificação numérica do produto primário da Cielo.
   **/
  @ApiModelProperty(required = true, value = "Identificação numérica do produto primário da Cielo.")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   * Nome do produto primário utilizado.
   **/
  @ApiModelProperty(required = true, value = "Nome do produto primário utilizado.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubPaymentProduct subPaymentProduct = (SubPaymentProduct) o;
    return (number == null ? subPaymentProduct.number == null : number.equals(subPaymentProduct.number)) &&
        (name == null ? subPaymentProduct.name == null : name.equals(subPaymentProduct.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (number == null ? 0: number.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubPaymentProduct {\n");
    
    sb.append("  number: ").append(number).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}