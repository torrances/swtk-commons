package org.swtk.commons.dict.wordnet.index.name.instance.w.e.e.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWEEP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"weeper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10792708\", \"10792794\"]}");
	add("{\"term\":\"weepiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07549666\"]}");
	add("{\"term\":\"weeping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00869874\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }