package org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cigar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03034020\"]}");
	add("{\"term\":\"cigar band\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03034247\"]}");
	add("{\"term\":\"cigar box\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03034338\"]}");
	add("{\"term\":\"cigar butt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03034418\"]}");
	add("{\"term\":\"cigar cutter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03034542\"]}");
	add("{\"term\":\"cigar lighter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03035407\"]}");
	add("{\"term\":\"cigar smoker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09942644\"]}");
	add("{\"term\":\"cigaret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03034648\"]}");
	add("{\"term\":\"cigarette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03034648\"]}");
	add("{\"term\":\"cigarette burn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04701641\"]}");
	add("{\"term\":\"cigarette butt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03034865\"]}");
	add("{\"term\":\"cigarette case\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03034997\"]}");
	add("{\"term\":\"cigarette holder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03035137\"]}");
	add("{\"term\":\"cigarette lighter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03035407\"]}");
	add("{\"term\":\"cigarette paper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14836736\"]}");
	add("{\"term\":\"cigarette smoker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09942559\"]}");
	add("{\"term\":\"cigarfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02584273\"]}");
	add("{\"term\":\"cigarillo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03035291\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }