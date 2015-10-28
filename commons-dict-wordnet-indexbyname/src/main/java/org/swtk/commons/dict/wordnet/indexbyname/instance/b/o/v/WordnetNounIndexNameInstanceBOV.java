package org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bovid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02403683\"]}");
	add("{\"term\":\"bovidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02402791\"]}");
	add("{\"term\":\"bovinae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02403957\"]}");
	add("{\"term\":\"bovine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02404662\"]}");
	add("{\"term\":\"bovini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02404161\"]}");
	add("{\"term\":\"bovril\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07826609\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }