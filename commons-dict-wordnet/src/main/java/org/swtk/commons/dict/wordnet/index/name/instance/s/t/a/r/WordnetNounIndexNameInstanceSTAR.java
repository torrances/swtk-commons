package org.swtk.commons.dict.wordnet.index.name.instance.s.t.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"star\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"05738875\", \"06841439\", \"10183316\", \"13904301\", \"10668135\", \"09467687\", \"09781932\", \"09467004\"]}");
	add("{\"term\":\"starboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04310810\"]}");
	add("{\"term\":\"starch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15043456\", \"15078434\"]}");
	add("{\"term\":\"starches\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07582428\"]}");
	add("{\"term\":\"stardom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13971984\"]}");
	add("{\"term\":\"stardust\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05215863\"]}");
	add("{\"term\":\"stare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00880134\"]}");
	add("{\"term\":\"starer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10668348\"]}");
	add("{\"term\":\"starets\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10668486\"]}");
	add("{\"term\":\"starfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02319987\"]}");
	add("{\"term\":\"starflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12480387\"]}");
	add("{\"term\":\"stargazer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02614528\", \"09837748\", \"10013657\"]}");
	add("{\"term\":\"stargazing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00882241\"]}");
	add("{\"term\":\"starkey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11333721\"]}");
	add("{\"term\":\"starkness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04705167\", \"05131799\"]}");
	add("{\"term\":\"starlet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09467846\", \"10668636\"]}");
	add("{\"term\":\"starlight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11505586\"]}");
	add("{\"term\":\"starling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01579336\"]}");
	add("{\"term\":\"starr\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11333721\"]}");
	add("{\"term\":\"starship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04311353\"]}");
	add("{\"term\":\"start\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"05164789\", \"06805045\", \"08671448\", \"00236302\", \"00869035\", \"00242566\", \"15290329\", \"07339790\"]}");
	add("{\"term\":\"starter\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00922541\", \"03131675\", \"07596911\", \"10375148\", \"10668747\", \"10668877\", \"04311513\"]}");
	add("{\"term\":\"starting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00242566\"]}");
	add("{\"term\":\"startle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00869035\"]}");
	add("{\"term\":\"startup\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00240777\", \"00243298\"]}");
	add("{\"term\":\"starvation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01153157\", \"14063792\"]}");
	add("{\"term\":\"starveling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10669163\"]}");
	add("{\"term\":\"starving\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01153157\"]}");
	add("{\"term\":\"starwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11838740\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }