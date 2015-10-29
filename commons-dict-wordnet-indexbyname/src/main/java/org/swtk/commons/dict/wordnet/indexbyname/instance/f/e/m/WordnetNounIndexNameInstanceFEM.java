package org.swtk.commons.dict.wordnet.indexbyname.instance.f.e.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFEM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08140952\"]}");
	add("{\"term\":\"female\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09642198\", \"01323363\"]}");
	add("{\"term\":\"female aristocrat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10103592\"]}");
	add("{\"term\":\"female body\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05227197\"]}");
	add("{\"term\":\"female bonding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13804420\"]}");
	add("{\"term\":\"female chest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05559127\"]}");
	add("{\"term\":\"female child\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10104064\"]}");
	add("{\"term\":\"female circumcision\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00670398\"]}");
	add("{\"term\":\"female genital organ\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05522061\"]}");
	add("{\"term\":\"female genitalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05522061\"]}");
	add("{\"term\":\"female genitals\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05522061\"]}");
	add("{\"term\":\"female horse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02380132\"]}");
	add("{\"term\":\"female internal reproductive organ\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05522368\"]}");
	add("{\"term\":\"female mammal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01865040\"]}");
	add("{\"term\":\"female monarch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10518940\"]}");
	add("{\"term\":\"female offspring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10103812\"]}");
	add("{\"term\":\"female parent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10352098\"]}");
	add("{\"term\":\"female person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09642198\"]}");
	add("{\"term\":\"female reproductive system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05521180\"]}");
	add("{\"term\":\"female sibling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10103950\"]}");
	add("{\"term\":\"femaleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05016127\"]}");
	add("{\"term\":\"feminine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06339989\"]}");
	add("{\"term\":\"feminineness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05016127\"]}");
	add("{\"term\":\"femininity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04674763\"]}");
	add("{\"term\":\"feminisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13500808\"]}");
	add("{\"term\":\"feminism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00802082\", \"05976640\"]}");
	add("{\"term\":\"feminist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10104404\"]}");
	add("{\"term\":\"feminist movement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00802082\"]}");
	add("{\"term\":\"feminization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13500808\"]}");
	add("{\"term\":\"femme fatale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10075218\"]}");
	add("{\"term\":\"femoral artery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05352795\"]}");
	add("{\"term\":\"femoral biceps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05586684\"]}");
	add("{\"term\":\"femoral nerve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05575737\"]}");
	add("{\"term\":\"femoral pulse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15306182\"]}");
	add("{\"term\":\"femoral vein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05374851\"]}");
	add("{\"term\":\"femoris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05581526\"]}");
	add("{\"term\":\"femtochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06099652\"]}");
	add("{\"term\":\"femtometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13679309\"]}");
	add("{\"term\":\"femtometre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13679309\"]}");
	add("{\"term\":\"femtosecond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15260484\"]}");
	add("{\"term\":\"femtovolt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13664588\"]}");
	add("{\"term\":\"femur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05581526\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }