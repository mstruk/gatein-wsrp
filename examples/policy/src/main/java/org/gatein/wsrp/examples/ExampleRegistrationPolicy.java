/*
* JBoss, a division of Red Hat
* Copyright 2012, Red Hat Middleware, LLC, and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
*
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/

package org.gatein.wsrp.examples;

import org.gatein.registration.InvalidConsumerDataException;
import org.gatein.registration.policies.DefaultRegistrationPolicy;

import javax.xml.namespace.QName;
import java.util.Map;

/** @author <a href="mailto:chris.laprun@jboss.com">Chris Laprun</a> */
public class ExampleRegistrationPolicy extends DefaultRegistrationPolicy
{
   @Override
   public String getConsumerIdFrom(String consumerName, Map<QName, Object> registrationProperties) throws IllegalArgumentException, InvalidConsumerDataException
   {
      return consumerName.toLowerCase();
   }
}
