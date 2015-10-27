package org.swtk.commons.dict.wordnet.index.name.instance.d.i.s.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDISI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"disillusion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05996982\"]}");
	add("{\"term\":\"disillusionment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05996982\"]}");
	add("{\"term\":\"disincentive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09203015\"]}");
	add("{\"term\":\"disinclination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04653300\", \"07517161\"]}");
	add("{\"term\":\"disinfectant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03212950\"]}");
	add("{\"term\":\"disinfection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00710774\"]}");
	add("{\"term\":\"disinfestation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00252387\"]}");
	add("{\"term\":\"disinflation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13488052\"]}");
	add("{\"term\":\"disinformation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06647838\"]}");
	add("{\"term\":\"disingenuousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04883569\"]}");
	add("{\"term\":\"disinheritance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01024934\"]}");
	add("{\"term\":\"disintegration\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07345428\", \"13478072\", \"13489119\", \"14585053\", \"14584919\"]}");
	add("{\"term\":\"disinterest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06214753\"]}");
	add("{\"term\":\"disinterestedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06212642\"]}");
	add("{\"term\":\"disinterment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00045638\"]}");
	add("{\"term\":\"disinvestment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00397317\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }