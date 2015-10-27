package org.swtk.commons.dict.wordnet.index.name.instance.k.i.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKILI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kilimanjaro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09348869\"]}");
	add("{\"term\":\"kiliwa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06935742\", \"09678893\"]}");
	add("{\"term\":\"kiliwi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06935742\", \"09678893\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }