package org.swtk.commons.dict.wordnet.index.name.instance.i.n.c.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINCA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"inca\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08505843\", \"09746533\", \"09746665\"]}");
	add("{\"term\":\"incalescence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05023635\"]}");
	add("{\"term\":\"incan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09746533\"]}");
	add("{\"term\":\"incandescence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05025840\", \"11488186\"]}");
	add("{\"term\":\"incantation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07174767\"]}");
	add("{\"term\":\"incapability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05214838\", \"05655712\"]}");
	add("{\"term\":\"incapableness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05214838\", \"05655712\"]}");
	add("{\"term\":\"incapacity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05215114\", \"05655991\"]}");
	add("{\"term\":\"incarceration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14022691\"]}");
	add("{\"term\":\"incarnation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00935074\", \"15148506\", \"06803702\", \"10438047\"]}");
	add("{\"term\":\"incasement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00323314\"]}");
	add("{\"term\":\"incaution\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04672567\"]}");
	add("{\"term\":\"incautiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04672567\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }