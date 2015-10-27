package org.swtk.commons.dict.wordnet.index.name.instance.e.m.b.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEMBE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"embellishment\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00263586\", \"03287312\", \"07187630\"]}");
	add("{\"term\":\"ember\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09296036\"]}");
	add("{\"term\":\"emberiza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01540351\"]}");
	add("{\"term\":\"emberizidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01539557\"]}");
	add("{\"term\":\"embezzlement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00778229\"]}");
	add("{\"term\":\"embezzler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071145\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }