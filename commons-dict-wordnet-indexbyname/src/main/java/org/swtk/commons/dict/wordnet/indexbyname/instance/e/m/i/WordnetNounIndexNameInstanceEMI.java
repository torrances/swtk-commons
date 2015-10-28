package org.swtk.commons.dict.wordnet.indexbyname.instance.e.m.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEMI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"emigrant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071783\"]}");
	add("{\"term\":\"emigration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00056907\"]}");
	add("{\"term\":\"emigre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071783\"]}");
	add("{\"term\":\"emigree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071783\"]}");
	add("{\"term\":\"emile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071936\"]}");
	add("{\"term\":\"emilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11983627\"]}");
	add("{\"term\":\"eminence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05550319\", \"14458911\"]}");
	add("{\"term\":\"emir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10072305\"]}");
	add("{\"term\":\"emirate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00593407\", \"08574933\"]}");
	add("{\"term\":\"emissary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10072502\"]}");
	add("{\"term\":\"emission\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07448468\", \"13487789\", \"13495493\", \"14876637\", \"01255647\"]}");
	add("{\"term\":\"emitter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03288738\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }