package org.swtk.commons.dict.wordnet.index.name.instance.p.h.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePHAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"phascogale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01887673\"]}");
	add("{\"term\":\"phascolarctos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01885248\"]}");
	add("{\"term\":\"phase\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04683897\", \"15315368\", \"14503649\", \"15315573\"]}");
	add("{\"term\":\"phaseolus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12576535\"]}");
	add("{\"term\":\"phasianid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01805362\"]}");
	add("{\"term\":\"phasianidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01804950\"]}");
	add("{\"term\":\"phasianus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01805536\"]}");
	add("{\"term\":\"phasmatidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02233959\"]}");
	add("{\"term\":\"phasmatodea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02233434\"]}");
	add("{\"term\":\"phasmid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02233704\"]}");
	add("{\"term\":\"phasmida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02233434\"]}");
	add("{\"term\":\"phasmidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02233959\"]}");
	add("{\"term\":\"phasmidia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01932592\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }