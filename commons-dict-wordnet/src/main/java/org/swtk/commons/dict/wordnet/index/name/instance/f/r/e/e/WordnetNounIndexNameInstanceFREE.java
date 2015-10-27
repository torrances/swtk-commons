package org.swtk.commons.dict.wordnet.index.name.instance.f.r.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFREE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"free\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07964544\"]}");
	add("{\"term\":\"freebee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13293568\"]}");
	add("{\"term\":\"freebie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13293568\"]}");
	add("{\"term\":\"freebooter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10462744\"]}");
	add("{\"term\":\"freedman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10129754\"]}");
	add("{\"term\":\"freedom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14552475\", \"14015308\"]}");
	add("{\"term\":\"freedwoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10129754\"]}");
	add("{\"term\":\"freehold\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13264032\", \"13264159\"]}");
	add("{\"term\":\"freeholder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10130056\"]}");
	add("{\"term\":\"freeing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00096322\"]}");
	add("{\"term\":\"freelance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10130190\"]}");
	add("{\"term\":\"freelancer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10130190\"]}");
	add("{\"term\":\"freeloader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10130662\"]}");
	add("{\"term\":\"freemail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06290458\"]}");
	add("{\"term\":\"freeman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10130792\"]}");
	add("{\"term\":\"freemason\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10130913\"]}");
	add("{\"term\":\"freemasonry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08252434\", \"13953106\"]}");
	add("{\"term\":\"freesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12437567\"]}");
	add("{\"term\":\"freestone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07754081\"]}");
	add("{\"term\":\"freestyle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07475608\"]}");
	add("{\"term\":\"freetail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02152072\"]}");
	add("{\"term\":\"freethinker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10020122\"]}");
	add("{\"term\":\"freethinking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05975825\"]}");
	add("{\"term\":\"freetown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09019502\"]}");
	add("{\"term\":\"freeware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06580041\"]}");
	add("{\"term\":\"freeway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03311555\"]}");
	add("{\"term\":\"freewheel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03398597\"]}");
	add("{\"term\":\"freewheeler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10129431\"]}");
	add("{\"term\":\"freewoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10130792\"]}");
	add("{\"term\":\"freeze\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00810428\", \"01065621\", \"11460617\", \"13505847\"]}");
	add("{\"term\":\"freezer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03175301\"]}");
	add("{\"term\":\"freezing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13505847\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }