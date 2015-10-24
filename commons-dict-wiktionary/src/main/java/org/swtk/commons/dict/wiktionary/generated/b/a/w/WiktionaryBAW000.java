package org.swtk.commons.dict.wiktionary.generated.b.a.w;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBAW000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bawd", "{\"term\":\"bawd\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\", \"frankish\", \"old french (842-ca. 1400)\", \"old high german (ca. 750-1050)\"], \"text\":\"From Middle english (1100-1500) \u0027bawde\u0027 \u0027baude\u0027 noun form of Old french (842-ca. 1400) \u0027baud\u0027 (bold, lively, jolly, gay) from Old Low Frankish *\u0027\u0027 (bald) from Proto-germanic {{m|gem-pro|*balþaz||strong, bold}}, from Proto-indo-european {{m|ine-pro|*bʰel-||to inflate, swell}}. Cognate with Old high german (ca. 750-1050) \u0027bald\u0027 (bold, bright) Old english (ca. 450-1100) \u0027beald\u0027 (bold, brave, confident, strong) More at {{l/en|bold}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who keeps a house of prostitution, or procures women for prostitution; a procurer, a madame\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1717\u0027\u0027, Ned Ward, \u0027s:British British Wonders\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"As Whores decay\u0027d and past their Labours, / Turn \u0027\u0027Bawds\u0027\u0027, and so assist their Neighbours\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, Faramerz Dabhoiwala, \u0027The Origins of Sex\u0027, Penguin 2013, p. 76\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Compared with their opponents, \u0027\u0027bawds\u0027\u0027 and their associates increasingly had deeper pockets and greater confidence in manipulating the law\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A lewd person\", \"priority\":6}]}, \"synonyms\":{}}");

	add("bawbee", "{\"term\":\"bawbee\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"scots\"], \"text\":\"From Scots \u0027bawbee\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A coin originally worth six pennies Scots, and later three; held equivalent to an English halfpenny\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A copper; a small amount of money\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, \u0027The Guardian\u0027, 12 Jul 2007\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"He said there were already plans for a tramline, and a museum of the theatre. Folk should not, he implied, waste their \u0027\u0027bawbees\u0027\u0027 on the devil\u0027s spinning wheel\", \"priority\":4}]}, \"synonyms\":{}}");

	add("bawler", "{\"term\":\"bawler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|bawl|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"agent Agent noun of bawl; one who bawls\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }