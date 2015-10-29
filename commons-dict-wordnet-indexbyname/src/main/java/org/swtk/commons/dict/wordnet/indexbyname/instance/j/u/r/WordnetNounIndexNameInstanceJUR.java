package org.swtk.commons.dict.wordnet.indexbyname.instance.j.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"jurassic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15151547\"]}");
	add("{\"term\":\"jurassic period\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15151547\"]}");
	add("{\"term\":\"jurisdiction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08607925\", \"05205695\"]}");
	add("{\"term\":\"jurisprudence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08458195\", \"06171434\"]}");
	add("{\"term\":\"jurist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10244889\", \"10247655\"]}");
	add("{\"term\":\"juror\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10247948\"]}");
	add("{\"term\":\"jury\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08431764\", \"08431076\"]}");
	add("{\"term\":\"jury box\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03611560\"]}");
	add("{\"term\":\"jury duty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01133456\"]}");
	add("{\"term\":\"jury mast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03611678\"]}");
	add("{\"term\":\"jury system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05912332\"]}");
	add("{\"term\":\"juryman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10247948\"]}");
	add("{\"term\":\"jurywoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10247948\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }