package org.swtk.commons.dict.wordnet.index.name.instance.b.a.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBARO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"barograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02797031\"]}");
	add("{\"term\":\"barometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02797179\"]}");
	add("{\"term\":\"baron\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09859605\", \"09859823\", \"09859908\"]}");
	add("{\"term\":\"baronage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08405367\"]}");
	add("{\"term\":\"baronduki\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02363132\"]}");
	add("{\"term\":\"baroness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09862697\"]}");
	add("{\"term\":\"baronet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09860027\"]}");
	add("{\"term\":\"baronetage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00590452\", \"08405514\"]}");
	add("{\"term\":\"baronetcy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06354734\", \"14456089\"]}");
	add("{\"term\":\"barong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02797391\"]}");
	add("{\"term\":\"barony\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08574594\", \"14456089\", \"13272805\"]}");
	add("{\"term\":\"baroque\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04705655\", \"15283887\"]}");
	add("{\"term\":\"baroqueness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04705655\"]}");
	add("{\"term\":\"baroreceptor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05307627\"]}");
	add("{\"term\":\"barosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01712517\"]}");
	add("{\"term\":\"barosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01712517\"]}");
	add("{\"term\":\"barouche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02797497\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }