package org.swtk.commons.dict.wordnet.index.name.instance.b.i.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBIOS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"biosafety\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14562413\"]}");
	add("{\"term\":\"bioscience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06046810\"]}");
	add("{\"term\":\"bioscope\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02845371\", \"02845457\"]}");
	add("{\"term\":\"biosphere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08516532\"]}");
	add("{\"term\":\"biostatistics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06051131\"]}");
	add("{\"term\":\"biosynthesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13459990\"]}");
	add("{\"term\":\"biosystematics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06162461\"]}");
	add("{\"term\":\"biosystematy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06162461\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }