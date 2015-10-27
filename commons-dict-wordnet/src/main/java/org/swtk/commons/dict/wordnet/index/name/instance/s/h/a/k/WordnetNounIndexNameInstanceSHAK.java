package org.swtk.commons.dict.wordnet.index.name.instance.s.h.a.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHAK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shake\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00348478\", \"00869661\", \"06644604\", \"06873227\", \"07939537\", \"15064012\"]}");
	add("{\"term\":\"shakedown\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00786588\", \"00995873\", \"07384522\"]}");
	add("{\"term\":\"shakeout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14517942\"]}");
	add("{\"term\":\"shaker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04190372\", \"10605181\", \"10605384\"]}");
	add("{\"term\":\"shakers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08167583\"]}");
	add("{\"term\":\"shakespeare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11315186\"]}");
	add("{\"term\":\"shakespearean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10605574\"]}");
	add("{\"term\":\"shakespearian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10605574\"]}");
	add("{\"term\":\"shakeup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01140308\"]}");
	add("{\"term\":\"shakiness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04783260\", \"14028057\"]}");
	add("{\"term\":\"shaking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14028057\", \"00348006\"]}");
	add("{\"term\":\"shako\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02820651\"]}");
	add("{\"term\":\"shakspere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11315186\"]}");
	add("{\"term\":\"shakti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09551721\"]}");
	add("{\"term\":\"shaktism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06249212\", \"08114188\"]}");
	add("{\"term\":\"shaktist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09704776\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }