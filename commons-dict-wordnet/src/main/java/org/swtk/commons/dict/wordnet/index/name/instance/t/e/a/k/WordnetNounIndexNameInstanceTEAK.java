package org.swtk.commons.dict.wordnet.index.name.instance.t.e.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTEAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"teak\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12937271\", \"12937483\"]}");
	add("{\"term\":\"teakettle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04404903\"]}");
	add("{\"term\":\"teakwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12937483\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }