package org.swtk.commons.dict.wordnet.index.name.instance.p.o.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOTT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pottage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07602594\", \"07602682\"]}");
	add("{\"term\":\"potter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10480372\"]}");
	add("{\"term\":\"potterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10515778\"]}");
	add("{\"term\":\"pottery\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03999246\", \"00611136\", \"03999061\"]}");
	add("{\"term\":\"pottle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03999333\"]}");
	add("{\"term\":\"potto\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02501947\", \"02511828\"]}");
	add("{\"term\":\"potty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03007879\", \"04453655\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }