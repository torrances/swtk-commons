package org.swtk.commons.dict.wordnet.index.name.instance.j.u.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJUNE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"june\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15236602\"]}");
	add("{\"term\":\"juneau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09078249\"]}");
	add("{\"term\":\"juneberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07761637\", \"12644285\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }