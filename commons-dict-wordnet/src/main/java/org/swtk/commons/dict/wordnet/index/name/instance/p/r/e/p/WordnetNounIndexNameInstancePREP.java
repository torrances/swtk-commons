package org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePREP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"prep\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00730406\"]}");
	add("{\"term\":\"preparation\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"00244785\", \"00730406\", \"00895653\", \"07041429\", \"14054590\", \"05802702\", \"14897792\", \"01145325\"]}");
	add("{\"term\":\"preparedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14054590\"]}");
	add("{\"term\":\"prepayment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01123813\"]}");
	add("{\"term\":\"preponderance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05035325\", \"05129364\", \"05198754\"]}");
	add("{\"term\":\"preposition\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06495681\", \"06336138\"]}");
	add("{\"term\":\"prepossession\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05958804\", \"13947896\"]}");
	add("{\"term\":\"prepotency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14466215\"]}");
	add("{\"term\":\"prepuberty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15173041\"]}");
	add("{\"term\":\"prepuce\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05534590\", \"05534718\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }