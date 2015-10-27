package org.swtk.commons.dict.wordnet.index.name.instance.v.i.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVICT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"victim\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10772148\", \"10771761\"]}");
	add("{\"term\":\"victimisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00419916\"]}");
	add("{\"term\":\"victimiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10772387\"]}");
	add("{\"term\":\"victimization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00419916\", \"14501093\"]}");
	add("{\"term\":\"victimizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10772387\"]}");
	add("{\"term\":\"victor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10802616\", \"10772598\"]}");
	add("{\"term\":\"victoria\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"08842306\", \"08852674\", \"09019084\", \"09169418\", \"09494768\", \"09591042\", \"11385852\"]}");
	add("{\"term\":\"victorian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10772729\"]}");
	add("{\"term\":\"victoriana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08014023\"]}");
	add("{\"term\":\"victory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07488581\"]}");
	add("{\"term\":\"victrola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04540794\"]}");
	add("{\"term\":\"victual\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07572202\"]}");
	add("{\"term\":\"victualer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10701004\", \"10772850\"]}");
	add("{\"term\":\"victualler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10701004\", \"10772850\"]}");
	add("{\"term\":\"victuals\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07572202\", \"07586285\", \"07587918\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }