/*
 * JBoss, a division of Red Hat
 * Copyright 2010, Red Hat Middleware, LLC, and individual
 * contributors as indicated by the @authors tag. See the
 * copyright.txt in the distribution for a full listing of
 * individual contributors.
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

package org.gatein.wsrp.producer;

import org.gatein.pc.api.PortletInvoker;
import org.gatein.registration.RegistrationManager;
import org.gatein.wsrp.producer.config.ProducerConfigurationChangeListener;
import org.gatein.wsrp.producer.config.ProducerConfigurationService;

/**
 * @author <a href="mailto:chris.laprun@jboss.com">Chris Laprun</a>
 * @version $Revision: 12020 $
 * @since 2.4
 */
public interface WSRPProducer extends ProducerConfigurationChangeListener
{
   /**
    * Retrieves the RegistrationManager used by this WSRPProducer.
    *
    * @return the RegistrationManager used by this WSRPProducer to manage consumer registrations
    * @since 2.6
    */
   RegistrationManager getRegistrationManager();

   /**
    * Sets the RegistrationManager used by this WSRPProducer.
    *
    * @param registrationManager the RegistrationManager to be used by this WSRPProducer
    */
   void setRegistrationManager(RegistrationManager registrationManager);

   /**
    * Retrieves the configuration service that is used to configure this WSRPProducer.
    *
    * @return the configuration service that is used to configure this WSRPProducer.
    */
   ProducerConfigurationService getConfigurationService();

   /**
    * Sets the configuration service for this WSRPProducer
    *
    * @param configurationService the configuration service used by this WSRPProducer
    */
   void setConfigurationService(ProducerConfigurationService configurationService);

   /**
    * Retrieves the PortletInvoker used by this WSRPProducer to dispatch portlet invocations to Portlets.
    *
    * @return the PortletInvoker used by this WSRPProducer to dispatch portlet invocations to Portlets.
    */
   PortletInvoker getPortletInvoker();

   /**
    * Sets the PortletInvoker used by this WSRPProducer to dispatch portlet invocations to Portlets.
    *
    * @param invoker PortletInvoker used by this WSRPProducer to dispatch portlet invocations to Portlets.
    */
   void setPortletInvoker(PortletInvoker invoker);

   /** Gets this WSRPProducer ready to use. */
   void start();

   /** Removes this WSRPProducer from active use. */
   void stop();
}
