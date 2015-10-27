package org.swtk.commons.dict.wordnet.index.name.instance.t.r.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTROP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tropaeolaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12740037\"]}");
	add("{\"term\":\"tropaeolum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12740215\"]}");
	add("{\"term\":\"trope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07120141\"]}");
	add("{\"term\":\"trophobiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13865040\"]}");
	add("{\"term\":\"trophoblast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01464850\"]}");
	add("{\"term\":\"trophotropism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00864166\"]}");
	add("{\"term\":\"trophozoite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01424976\"]}");
	add("{\"term\":\"trophy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04495252\", \"06722381\"]}");
	add("{\"term\":\"tropic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08692883\"]}");
	add("{\"term\":\"tropicbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02057761\"]}");
	add("{\"term\":\"tropics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08683019\"]}");
	add("{\"term\":\"tropidoclonion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01738539\"]}");
	add("{\"term\":\"tropism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00863289\"]}");
	add("{\"term\":\"troponomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08481460\"]}");
	add("{\"term\":\"troponym\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06315415\"]}");
	add("{\"term\":\"troponymy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08481460\", \"13831080\"]}");
	add("{\"term\":\"tropopause\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09485582\"]}");
	add("{\"term\":\"troposphere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09485730\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }