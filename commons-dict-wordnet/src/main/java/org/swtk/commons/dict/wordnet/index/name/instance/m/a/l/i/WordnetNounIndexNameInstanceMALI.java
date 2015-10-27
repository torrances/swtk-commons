package org.swtk.commons.dict.wordnet.index.name.instance.m.a.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMALI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mali\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08987949\"]}");
	add("{\"term\":\"malian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09741675\"]}");
	add("{\"term\":\"malice\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04849544\", \"07566132\"]}");
	add("{\"term\":\"maliciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07566132\"]}");
	add("{\"term\":\"malignance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04850019\", \"14261043\"]}");
	add("{\"term\":\"malignancy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04850019\", \"14261043\"]}");
	add("{\"term\":\"maligner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10018655\"]}");
	add("{\"term\":\"malignity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04850019\", \"07565835\"]}");
	add("{\"term\":\"malignment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06732965\"]}");
	add("{\"term\":\"malik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10305979\"]}");
	add("{\"term\":\"malingerer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10306236\"]}");
	add("{\"term\":\"malingering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00742570\"]}");
	add("{\"term\":\"malinois\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02107814\"]}");
	add("{\"term\":\"malinowski\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11171569\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }