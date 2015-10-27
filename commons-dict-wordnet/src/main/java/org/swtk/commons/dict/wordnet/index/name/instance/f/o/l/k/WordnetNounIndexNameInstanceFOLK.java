package org.swtk.commons.dict.wordnet.index.name.instance.f.o.l.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFOLK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"folk\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07074207\", \"07987168\", \"08389338\", \"07963841\"]}");
	add("{\"term\":\"folklore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05994487\"]}");
	add("{\"term\":\"folks\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07963841\", \"07987470\"]}");
	add("{\"term\":\"folksong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07064992\"]}");
	add("{\"term\":\"folktale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07236710\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }