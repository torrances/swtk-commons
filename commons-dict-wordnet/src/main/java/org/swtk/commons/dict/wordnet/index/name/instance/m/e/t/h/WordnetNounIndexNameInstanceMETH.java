package org.swtk.commons.dict.wordnet.index.name.instance.m.e.t.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMETH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"meth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03759824\"]}");
	add("{\"term\":\"methacholine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03759355\"]}");
	add("{\"term\":\"methadon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03759543\"]}");
	add("{\"term\":\"methadone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03759543\"]}");
	add("{\"term\":\"methamphetamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03759824\"]}");
	add("{\"term\":\"methanal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14897347\"]}");
	add("{\"term\":\"methane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14975368\"]}");
	add("{\"term\":\"methanogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01350499\"]}");
	add("{\"term\":\"methanol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14711979\"]}");
	add("{\"term\":\"methapyrilene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03760205\"]}");
	add("{\"term\":\"methaqualone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03760351\"]}");
	add("{\"term\":\"metharbital\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03760508\"]}");
	add("{\"term\":\"methedrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03759824\"]}");
	add("{\"term\":\"metheglin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07906865\"]}");
	add("{\"term\":\"methenamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03760669\"]}");
	add("{\"term\":\"methicillin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03760917\"]}");
	add("{\"term\":\"methionine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14976429\"]}");
	add("{\"term\":\"methocarbamol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03761074\"]}");
	add("{\"term\":\"method\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00550803\", \"05668113\"]}");
	add("{\"term\":\"methodicalness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04775722\"]}");
	add("{\"term\":\"methodism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06241648\"]}");
	add("{\"term\":\"methodist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10332258\"]}");
	add("{\"term\":\"methodists\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08109306\"]}");
	add("{\"term\":\"methodology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05669245\", \"06176614\"]}");
	add("{\"term\":\"methotrexate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03761241\"]}");
	add("{\"term\":\"methuselah\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10395205\", \"11197360\"]}");
	add("{\"term\":\"methyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14976261\"]}");
	add("{\"term\":\"methylbenzene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15099945\"]}");
	add("{\"term\":\"methyldopa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03761520\"]}");
	add("{\"term\":\"methylene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14976122\"]}");
	add("{\"term\":\"methylenedioxymethamphetamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03761713\"]}");
	add("{\"term\":\"methylphenidate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03762153\"]}");
	add("{\"term\":\"methyltestosterone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14772296\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }