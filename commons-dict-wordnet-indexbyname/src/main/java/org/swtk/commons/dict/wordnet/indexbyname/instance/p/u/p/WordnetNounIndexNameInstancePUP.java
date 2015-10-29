package org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pup\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10513420\", \"01324834\"]}");
	add("{\"term\":\"pup tent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04031902\"]}");
	add("{\"term\":\"pupa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02315079\"]}");
	add("{\"term\":\"pupet regime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08195239\"]}");
	add("{\"term\":\"pupil\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10578716\", \"05327733\", \"10685137\"]}");
	add("{\"term\":\"pupillary reflex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00867486\"]}");
	add("{\"term\":\"pupillary sphincter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05580571\"]}");
	add("{\"term\":\"puppet\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04031524\", \"09996081\", \"04031744\"]}");
	add("{\"term\":\"puppet government\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08195239\"]}");
	add("{\"term\":\"puppet leader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10513113\"]}");
	add("{\"term\":\"puppet play\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07032747\"]}");
	add("{\"term\":\"puppet ruler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10513113\"]}");
	add("{\"term\":\"puppet show\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07032747\"]}");
	add("{\"term\":\"puppet state\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08195239\"]}");
	add("{\"term\":\"puppeteer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10513270\"]}");
	add("{\"term\":\"puppetry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00901355\", \"05644139\"]}");
	add("{\"term\":\"puppis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09424034\"]}");
	add("{\"term\":\"puppy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10513420\", \"01325095\"]}");
	add("{\"term\":\"puppy fat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05277283\"]}");
	add("{\"term\":\"puppy love\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07559739\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }