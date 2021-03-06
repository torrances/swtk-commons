package org.swtk.commons.dict.wordnet.indexbyname.instance.p.o.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"poke\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00135600\", \"00335761\", \"04129919\", \"10012790\", \"11876022\"]}");
	add("{\"term\":\"poke bonnet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02873198\"]}");
	add("{\"term\":\"poke check\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00564249\"]}");
	add("{\"term\":\"poke milkweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13255417\"]}");
	add("{\"term\":\"poker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00495779\", \"03982284\"]}");
	add("{\"term\":\"poker alumroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12819392\"]}");
	add("{\"term\":\"poker chip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03024099\"]}");
	add("{\"term\":\"poker face\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04687490\"]}");
	add("{\"term\":\"poker game\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00495779\"]}");
	add("{\"term\":\"poker hand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07974269\"]}");
	add("{\"term\":\"poker heuchera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12819392\"]}");
	add("{\"term\":\"poker plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12458274\"]}");
	add("{\"term\":\"pokeweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11875743\"]}");
	add("{\"term\":\"pokeweed family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11875229\"]}");
	add("{\"term\":\"pokey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03597432\"]}");
	add("{\"term\":\"poking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00335761\"]}");
	add("{\"term\":\"pokomo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07007676\"]}");
	add("{\"term\":\"poky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03597432\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }