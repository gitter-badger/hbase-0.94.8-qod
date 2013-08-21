// Autogenerated Jamon proxy
// /Users/algarecu/Documents/workspace/hbase-workspace/hbase-0.94.8-latest/src/main/jamon/org/apache/hadoop/hbase/tmpl/master/MasterStatusTmpl.jamon

package org.apache.hadoop.hbase.tmpl.master;

// 33, 1
import java.util.*;
// 34, 1
import org.apache.hadoop.util.StringUtils;
// 35, 1
import org.apache.hadoop.hbase.util.Bytes;
// 36, 1
import org.apache.hadoop.hbase.util.JvmVersion;
// 37, 1
import org.apache.hadoop.hbase.util.FSUtils;
// 38, 1
import org.apache.hadoop.hbase.master.HMaster;
// 39, 1
import org.apache.hadoop.hbase.HConstants;
// 40, 1
import org.apache.hadoop.hbase.HServerLoad;
// 41, 1
import org.apache.hadoop.hbase.ServerName;
// 42, 1
import org.apache.hadoop.hbase.client.HBaseAdmin;
// 43, 1
import org.apache.hadoop.hbase.client.HConnectionManager;
// 44, 1
import org.apache.hadoop.hbase.HTableDescriptor;
// 45, 1
import org.apache.hadoop.hbase.HBaseConfiguration;
// 46, 1
import org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.SnapshotDescription;

@org.jamon.annotations.Template(
  signature = "087F3ED7054C25E017A73800B0EBD0B6",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "master", type = "HMaster"),
    @org.jamon.annotations.Argument(name = "admin", type = "HBaseAdmin")},
  optionalArguments = {
    @org.jamon.annotations.Argument(name = "frags", type = "Map<String,Integer>"),
    @org.jamon.annotations.Argument(name = "metaLocation", type = "ServerName"),
    @org.jamon.annotations.Argument(name = "rootLocation", type = "ServerName"),
    @org.jamon.annotations.Argument(name = "filter", type = "String"),
    @org.jamon.annotations.Argument(name = "deadServers", type = "Set<ServerName>"),
    @org.jamon.annotations.Argument(name = "showAppendWarning", type = "boolean"),
    @org.jamon.annotations.Argument(name = "servers", type = "List<ServerName>"),
    @org.jamon.annotations.Argument(name = "format", type = "String")})
public class MasterStatusTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public MasterStatusTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  public MasterStatusTmpl()
  {
     super("/org/apache/hadoop/hbase/tmpl/master/MasterStatusTmpl");
  }
  
  protected interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf{
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 21, 1
    public void setMaster(HMaster master)
    {
      // 21, 1
      m_master = master;
    }
    public HMaster getMaster()
    {
      return m_master;
    }
    private HMaster m_master;
    // 22, 1
    public void setAdmin(HBaseAdmin admin)
    {
      // 22, 1
      m_admin = admin;
    }
    public HBaseAdmin getAdmin()
    {
      return m_admin;
    }
    private HBaseAdmin m_admin;
    // 23, 1
    public void setFrags(Map<String,Integer> frags)
    {
      // 23, 1
      m_frags = frags;
      m_frags__IsNotDefault = true;
    }
    public Map<String,Integer> getFrags()
    {
      return m_frags;
    }
    private Map<String,Integer> m_frags;
    public boolean getFrags__IsNotDefault()
    {
      return m_frags__IsNotDefault;
    }
    private boolean m_frags__IsNotDefault;
    // 25, 1
    public void setMetaLocation(ServerName metaLocation)
    {
      // 25, 1
      m_metaLocation = metaLocation;
      m_metaLocation__IsNotDefault = true;
    }
    public ServerName getMetaLocation()
    {
      return m_metaLocation;
    }
    private ServerName m_metaLocation;
    public boolean getMetaLocation__IsNotDefault()
    {
      return m_metaLocation__IsNotDefault;
    }
    private boolean m_metaLocation__IsNotDefault;
    // 24, 1
    public void setRootLocation(ServerName rootLocation)
    {
      // 24, 1
      m_rootLocation = rootLocation;
      m_rootLocation__IsNotDefault = true;
    }
    public ServerName getRootLocation()
    {
      return m_rootLocation;
    }
    private ServerName m_rootLocation;
    public boolean getRootLocation__IsNotDefault()
    {
      return m_rootLocation__IsNotDefault;
    }
    private boolean m_rootLocation__IsNotDefault;
    // 29, 1
    public void setFilter(String filter)
    {
      // 29, 1
      m_filter = filter;
      m_filter__IsNotDefault = true;
    }
    public String getFilter()
    {
      return m_filter;
    }
    private String m_filter;
    public boolean getFilter__IsNotDefault()
    {
      return m_filter__IsNotDefault;
    }
    private boolean m_filter__IsNotDefault;
    // 27, 1
    public void setDeadServers(Set<ServerName> deadServers)
    {
      // 27, 1
      m_deadServers = deadServers;
      m_deadServers__IsNotDefault = true;
    }
    public Set<ServerName> getDeadServers()
    {
      return m_deadServers;
    }
    private Set<ServerName> m_deadServers;
    public boolean getDeadServers__IsNotDefault()
    {
      return m_deadServers__IsNotDefault;
    }
    private boolean m_deadServers__IsNotDefault;
    // 28, 1
    public void setShowAppendWarning(boolean showAppendWarning)
    {
      // 28, 1
      m_showAppendWarning = showAppendWarning;
      m_showAppendWarning__IsNotDefault = true;
    }
    public boolean getShowAppendWarning()
    {
      return m_showAppendWarning;
    }
    private boolean m_showAppendWarning;
    public boolean getShowAppendWarning__IsNotDefault()
    {
      return m_showAppendWarning__IsNotDefault;
    }
    private boolean m_showAppendWarning__IsNotDefault;
    // 26, 1
    public void setServers(List<ServerName> servers)
    {
      // 26, 1
      m_servers = servers;
      m_servers__IsNotDefault = true;
    }
    public List<ServerName> getServers()
    {
      return m_servers;
    }
    private List<ServerName> m_servers;
    public boolean getServers__IsNotDefault()
    {
      return m_servers__IsNotDefault;
    }
    private boolean m_servers__IsNotDefault;
    // 30, 1
    public void setFormat(String format)
    {
      // 30, 1
      m_format = format;
      m_format__IsNotDefault = true;
    }
    public String getFormat()
    {
      return m_format;
    }
    private String m_format;
    public boolean getFormat__IsNotDefault()
    {
      return m_format__IsNotDefault;
    }
    private boolean m_format__IsNotDefault;
  }
  @Override
  protected ImplData makeImplData()
  {
    return new ImplData();
  }
  @Override @SuppressWarnings("unchecked") public ImplData getImplData()
  {
    return (ImplData) super.getImplData();
  }
  
  protected Map<String,Integer> frags;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setFrags(Map<String,Integer> p_frags)
  {
    (getImplData()).setFrags(p_frags);
    return this;
  }
  
  protected ServerName metaLocation;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setMetaLocation(ServerName p_metaLocation)
  {
    (getImplData()).setMetaLocation(p_metaLocation);
    return this;
  }
  
  protected ServerName rootLocation;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setRootLocation(ServerName p_rootLocation)
  {
    (getImplData()).setRootLocation(p_rootLocation);
    return this;
  }
  
  protected String filter;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setFilter(String p_filter)
  {
    (getImplData()).setFilter(p_filter);
    return this;
  }
  
  protected Set<ServerName> deadServers;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setDeadServers(Set<ServerName> p_deadServers)
  {
    (getImplData()).setDeadServers(p_deadServers);
    return this;
  }
  
  protected boolean showAppendWarning;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setShowAppendWarning(boolean p_showAppendWarning)
  {
    (getImplData()).setShowAppendWarning(p_showAppendWarning);
    return this;
  }
  
  protected List<ServerName> servers;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setServers(List<ServerName> p_servers)
  {
    (getImplData()).setServers(p_servers);
    return this;
  }
  
  protected String format;
  public final org.apache.hadoop.hbase.tmpl.master.MasterStatusTmpl setFormat(String p_format)
  {
    (getImplData()).setFormat(p_format);
    return this;
  }
  
  
  @Override
  public org.jamon.AbstractTemplateImpl constructImpl(Class<? extends org.jamon.AbstractTemplateImpl> p_class){
    try
    {
      return p_class
        .getConstructor(new Class [] { org.jamon.TemplateManager.class, ImplData.class })
        .newInstance(new Object [] { getTemplateManager(), getImplData()});
    }
    catch (RuntimeException e)
    {
      throw e;
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  protected org.jamon.AbstractTemplateImpl constructImpl(){
    return new MasterStatusTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final HMaster master, final HBaseAdmin admin)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, master, admin);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final HMaster master, final HBaseAdmin admin)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, master, admin);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final HMaster master, final HBaseAdmin admin)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setMaster(master);
    implData.setAdmin(admin);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}
