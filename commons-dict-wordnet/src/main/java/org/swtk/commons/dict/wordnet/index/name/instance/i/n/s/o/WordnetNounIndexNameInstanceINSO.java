package org.swtk.commons.dict.wordnet.index.name.instance.i.n.s.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINSO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"insobriety\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14042038\"]}");
	add("{\"term\":\"insolation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00664215\", \"11530386\", \"14228068\"]}");
	add("{\"term\":\"insole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03578999\"]}");
	add("{\"term\":\"insolence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01227403\", \"04923043\"]}");
	add("{\"term\":\"insolubility\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05217641\", \"05222967\"]}");
	add("{\"term\":\"insolvency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14501875\"]}");
	add("{\"term\":\"insolvent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09857758\"]}");
	add("{\"term\":\"insomnia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14046845\"]}");
	add("{\"term\":\"insomniac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10228349\"]}");
	add("{\"term\":\"insouciance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07546254\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }