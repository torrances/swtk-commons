package org.swtk.commons.dict.wordnet.index.name.instance.g.a.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGAUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gaucheness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04922298\"]}");
	add("{\"term\":\"gaucherie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00077016\", \"04823356\"]}");
	add("{\"term\":\"gaucho\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10142098\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }