package org.swtk.commons.dict.wordnet.index.name.instance.c.r.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCROO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"crook\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03138769\", \"13891966\", \"09997190\"]}");
	add("{\"term\":\"crookback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10212031\"]}");
	add("{\"term\":\"crookedness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04882751\", \"05081387\", \"13908063\"]}");
	add("{\"term\":\"crookes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10936257\"]}");
	add("{\"term\":\"crookneck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07731948\"]}");
	add("{\"term\":\"crooner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09999620\"]}");
	add("{\"term\":\"crooning\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00548009\", \"00548138\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }