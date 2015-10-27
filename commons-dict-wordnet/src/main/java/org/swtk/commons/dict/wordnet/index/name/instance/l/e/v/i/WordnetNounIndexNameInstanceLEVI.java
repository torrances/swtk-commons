package org.swtk.commons.dict.wordnet.index.name.instance.l.e.v.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEVI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"levi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11184661\"]}");
	add("{\"term\":\"leviathan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09519933\", \"10275425\"]}");
	add("{\"term\":\"levirate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05677462\"]}");
	add("{\"term\":\"levis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03665450\"]}");
	add("{\"term\":\"levisticum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12960820\"]}");
	add("{\"term\":\"levitation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00325525\", \"07377667\", \"11428847\"]}");
	add("{\"term\":\"levite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10275612\"]}");
	add("{\"term\":\"leviticus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06444705\"]}");
	add("{\"term\":\"levitra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04528723\"]}");
	add("{\"term\":\"levity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04656106\", \"07527145\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }