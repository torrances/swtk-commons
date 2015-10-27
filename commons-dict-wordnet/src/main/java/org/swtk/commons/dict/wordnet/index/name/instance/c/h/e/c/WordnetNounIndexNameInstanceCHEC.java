package org.swtk.commons.dict.wordnet.index.name.instance.c.h.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHEC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chechen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06991082\", \"09932365\"]}");
	add("{\"term\":\"chechenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09026995\"]}");
	add("{\"term\":\"chechnya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09026995\"]}");
	add("{\"term\":\"check\", \"synsetCount\":13, \"upperType\":\"NOUN\", \"ids\":[\"00168267\", \"00563972\", \"01148552\", \"03014816\", \"04700256\", \"05697054\", \"06831605\", \"00142626\", \"05833569\", \"14034398\", \"06529933\", \"05746570\", \"13402907\"]}");
	add("{\"term\":\"checkbook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13435483\"]}");
	add("{\"term\":\"checker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03015009\", \"09932453\", \"09932568\"]}");
	add("{\"term\":\"checkerberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07759699\", \"12256282\"]}");
	add("{\"term\":\"checkerbloom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12207764\"]}");
	add("{\"term\":\"checkerboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03015175\"]}");
	add("{\"term\":\"checkers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00503963\"]}");
	add("{\"term\":\"checklist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06501061\"]}");
	add("{\"term\":\"checkmate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00168585\", \"07490175\"]}");
	add("{\"term\":\"checkout\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03015395\", \"15206117\", \"00142626\"]}");
	add("{\"term\":\"checkpoint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08535103\"]}");
	add("{\"term\":\"checkrein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02820386\"]}");
	add("{\"term\":\"checkroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03015546\"]}");
	add("{\"term\":\"checksum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05834416\"]}");
	add("{\"term\":\"checkup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00143181\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }