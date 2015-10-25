package org.swtk.commons.dict.wiktionary.generated.n.e.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNEV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nevadaite", "{\"term\":\"nevadaite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Nevada|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An orthorhombic-disphenoidal mineral containing aluminum, copper, fluorine, hydrogen, oxygen, phosphorus, vanadium, and zinc\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nevadan", "{\"term\":\"nevadan\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Nevada|an|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An inhabitant of Nevada\", \"priority\":1}]}, \"synonyms\":{}}");

	add("neverendum", "{\"term\":\"neverendum\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|neverending|referendum|lang\u003den}}. Coined by Canadian writer w:Josh Freed|Josh Freed in the context of repeated referendums on the secession of Quebec.\u0026lt;ref\u0026gt;\u0027\u00271995\u0027\u0027, \u0027Canadian Annual Review of Politics and Public Affairs\u0027, University of Toronto Press, [http://books.google.com.au/books?id\u003d0Tp6AAAAMAAJ\u0026amp;q\u003d%22neverendum%22%7C%22neverendums%7C%22neverenda%22+%22Josh+Freed%22\u0026amp;dq\u003d%22neverendum%22%7C%22neverendums%7C%22neverenda%22+%22Josh+Freed%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dxWSuUsCYDcP7kgWl8oH4BQ\u0026amp;redir_esc\u003dy page 139] — Josh Freed, the award-winning humorist of the \u0027Montreal Gazette\u0027, coined a new word to be added to the Quebec lexicon: the ‘\u0027\u0027neverendum\u0027\u0027.’\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A series of referendums on the same issue held in an attempt to achieve an unpopular result\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1998\u0027\u0027, Pierre Desrochers, Eric Duhaime, \u002710: A Secessionist\u0027s View of Quebec\u0027s Options\u0027, David Gordon (editor), \u0027Secession, State, and Liberty\u0027, [http://books.google.com.au/books?id\u003dLXPrFpIioL0C\u0026amp;pg\u003dPA239\u0026amp;dq\u003d%22neverendum%22%7C%22neverendums%7C%22neverenda%22+Josh+Freed\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dpmSuUs2lLYbkkgXnv4C4Bw\u0026amp;redir_esc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22neverendum%22%7C%22neverendums%7C%22neverenda%22%20Josh%20Freed\u0026amp;f\u003dfalse page 239\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Another \u0026quot;\u0027\u0027neverendum\u0027\u0027\u0026quot; (as Canadian nationalists call this process) on Quebec\u0027s secession is planned before the year 2000\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1999\u0027\u0027, David Schneiderman, \u0027The Quebec Decision: Perspectives on the Supreme Court Ruling on Secession\u0027, [http://books.google.com.au/books?id\u003dexdLAQAAIAAJ\u0026amp;q\u003d%22neverendum%22%7C%22neverendums%7C%22neverenda%22+Josh+Freed\u0026amp;dq\u003d%22neverendum%22%7C%22neverendums%7C%22neverenda%22+Josh+Freed\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dpmSuUs2lLYbkkgXnv4C4Bw\u0026amp;redir_esc\u003dy page 123\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"And so, the \u0027\u0027neverendum\u0027\u0027 marches on. This is good news for the Liberals but bad news for Canada\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, Henry McLeish, \u0027Scotland: The Growing Divide: Old Nation, New Ideas\u0027, [http://books.google.com.au/books?id\u003d5Vt-SAUFdW0C\u0026amp;pg\u003dPA116\u0026amp;dq\u003d%22neverendum%22%7C%22neverendums%7C%22neverenda%22+Josh+Freed\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dpmSuUs2lLYbkkgXnv4C4Bw\u0026amp;redir_esc\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22neverendum%22%7C%22neverendums%7C%22neverenda%22%20Josh%20Freed\u0026amp;f\u003dfalse page 116\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"This is the Québécois scenario of the ‘\u0027\u0027neverendum\u0027\u0027’, which could be replicated in Scotland: the voters park their ideology and values at the elections to the Holyrood Parliament and elect an SNP or SNP coalition government, but vote differently at Westminster elections\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }