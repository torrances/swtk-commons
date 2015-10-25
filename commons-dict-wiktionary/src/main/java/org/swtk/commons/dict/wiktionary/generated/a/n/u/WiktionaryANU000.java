package org.swtk.commons.dict.wiktionary.generated.a.n.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryANU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("anuresis", "{\"term\":\"anuresis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The inability to urinate; the retention of urine in the bladder\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Perminder S. Sachdev, Matcheri S. Keshavan (editors), \u0027Secondary Schizophrenia\u0027, Cambridge University Press, [http://books.google.com.au/books?id\u003d44_zy35zFnIC\u0026amp;pg\u003dPA235\u0026amp;dq\u003d%22anuresis%22%7C%22anureses%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dc9aAUdn_DvGSiQesi4HoDA\u0026amp;redir_esc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22anuresis%22%7C%22anureses%22\u0026amp;f\u003dfalse page 235\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Kaido [35] describes a 53-year-old Japanese lady whose index presentation was with vomiting, \u0027\u0027anuresis\u0027\u0027, and clouded conscious state on a background of 6 months of apathy\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, David Foster Wallace, \u0027Consider The Lobster: Essays and Arguments\u0027, [http://books.google.com.au/books?id\u003dr3K6qSy-1mkC\u0026amp;pg\u003dPR7\u0026amp;dq\u003d%22anuresis%22%7C%22anureses%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dc9aAUdn_DvGSiQesi4HoDA\u0026amp;redir_esc\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22anuresis%22%7C%22anureses%22\u0026amp;f\u003dfalse page vii\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Suffice it to say that the urge to look over/down at their penises is powerful and the motives behind this urge so complex as to cause \u0027\u0027anuresis\u0027\u0027 (which in turn ups the trauma\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027 March, Paul Nikolaidis, Nancy A. Hammond (guest editors), Frank H. Miller (consulting editor), \u0027Genitourinary Imaging\u0027, \u0027Radiologic Clinics of North America\u0027, Volume 50, Number 2, [http://books.google.com.au/books?id\u003djU4CCiGssNUC\u0026amp;pg\u003dPT291\u0026amp;dq\u003d%22anuresis%22%7C%22anureses%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dc9aAUdn_DvGSiQesi4HoDA\u0026amp;redir_esc\u003dy unnumbered page\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Although rare, symptoms may include lumbar or hip pain, dysuria, oliguria, \u0027\u0027anuresis\u0027\u0027, and, more rarely, hematuria and pollakiuria\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }