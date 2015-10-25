package org.swtk.commons.dict.wiktionary.generated.b.i.m;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBIM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("bimatrix", "{\"term\":\"bimatrix\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|bi|matrix|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a matrix with two elements per cell\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027 Maria-Florina Balcan, Mark Braverman, \u0026quot;Approximate Nash Equilibria under Stability Conditions\u0026quot; [http://arxiv.org/abs/1008.1827 arXiv\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Finding approximate Nash equilibria in n x n \u0027\u0027bimatrix\u0027\u0027 games is currently one of the main open problems in algorithmic game theory\", \"priority\":3}]}, \"synonyms\":{}}");

	add("bimbo", "{\"term\":\"bimbo\", \"etymology\":{\"influencers\":[{},{},{}], \"languages\":[\"English\", \"Italian\"], \"text\":\"From Italian \u0027bimbo\u0027 (a child, a male baby) variant of \u0027bambino\u0027 (child) Originated in Italian American theater, attested 1919, as “stupid, inconsequential man”, by 1920 developed sense of “floozie, attractive and stupid woman”.\u0026lt;ref name\u003d\u0026quot;oetlyd\u0026quot;\u0026gt;{{R:Online Etymology Dictionary}}\u0026lt;/ref\u0026gt; Popularized in 1920s by Jack Conway of entertainment magazine \u0027w:Variety (magazine)|Variety,\u0027 who also popularized \u0027baloney\u0027 (nonsense) and \u0027palooka\u0027 (large stupid man) Revived in popularity in 1980s US political sex scandals.\u0026lt;ref name\u003d\u0026quot;oetlyd\u0026quot;/\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A physically attractive woman who lacks intelligence\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A stupid or foolish person\", \"priority\":2}]}, \"synonyms\":{}}");

	add("bimbette", "{\"term\":\"bimbette\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|bimbo|ette|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A bimbo; a foolish, ditzy female\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bimble", "{\"term\":\"bimble\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A gentle, meandering walk with no particular haste or purpose\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bimetallism", "{\"term\":\"bimetallism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|bi|metallism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The use of a monetary standard based upon two different metals, traditionally gold and silver usually in a fixed ratio of values\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bimillennial", "{\"term\":\"bimillennial\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027bimillennialis\u0027 from \u0027bi-\u0027 (two) \u0027mill-\u0027 (thousand) + \u0027ennius\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The 2,000th anniversary of an event or happening\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bimmy", "{\"term\":\"bimmy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|perhaps from bum|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A sennet whip\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bimoraicity", "{\"term\":\"bimoraicity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The property of having two morae\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }