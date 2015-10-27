package org.swtk.commons.dict.wordnet.index.name.instance.p.r.e.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePREM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"prematureness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14450140\"]}");
	add("{\"term\":\"prematurity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14450140\"]}");
	add("{\"term\":\"premeditation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05804230\", \"05804625\"]}");
	add("{\"term\":\"premie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10485017\"]}");
	add("{\"term\":\"premier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09926439\", \"09926654\"]}");
	add("{\"term\":\"premiere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06906324\"]}");
	add("{\"term\":\"premiership\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00597807\"]}");
	add("{\"term\":\"premise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06766514\"]}");
	add("{\"term\":\"premises\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08644736\"]}");
	add("{\"term\":\"premiss\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06766514\"]}");
	add("{\"term\":\"premium\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"13293082\", \"13293306\", \"13345319\", \"13435159\", \"13322642\"]}");
	add("{\"term\":\"premix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07898861\"]}");
	add("{\"term\":\"premolar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05314857\"]}");
	add("{\"term\":\"premonition\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07240110\", \"07537367\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }