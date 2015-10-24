package org.swtk.commons.dict.wiktionary.generated.s.u.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySUL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("sulfane", "{\"term\":\"sulfane\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|sulfo|ane|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"hydrogen sulfide\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sulfolipid", "{\"term\":\"sulfolipid\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"any sulfate ester of a glycolipid\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sulfonium", "{\"term\":\"sulfonium\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|sulfo|onium|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the univalent H\u0026lt;sub\u0026gt;3\u0026lt;/sub\u0026gt;S\u0026lt;sup\u0026gt;+\u0026lt;/sup\u0026gt; cation, derived from sulfane\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sulfoquinovosyldiacylglycerol", "{\"term\":\"sulfoquinovosyldiacylglycerol\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A glycerophospholipid that, along with galactosyldiacylglycerol, is an important component of membranes of chloroplasts and related organelles and one of the most abundant lipids in photosynthetic tissues\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2001\u0027\u0027, Bertram Fraser-Reid (ed.), \u0027Glycoscience\u0027, p. 2085\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Sulfoquinovosyldiacylglycerol\u0027\u0027 lipids have also been identified in phototrophic and a few other bacterial species\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2009\u0027\u0027, Hajime Wada \u0026amp; Norio Murata (eds.), \u0027Lipids in Photosynthesis\u0027, p. 2\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"There are four major glyceroplipid components in the thylakoid membranes, namely, monogalactosyldiacylglycerol (MGDG), digalactosyldiacylglycerol (DGDG), \u0027\u0027sulfoquinovosyldiacylglycerol\u0027\u0027 (SQDG) and phosphatidylglycerol (PG\", \"priority\":5}]}, \"synonyms\":{}}");

	add("sulforhodamine", "{\"term\":\"sulforhodamine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|sulfo|rhodamine|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any derivative of a rhodamine formed by adding one or more sulfonate groups. Often used as fluorescent dyes\", \"priority\":1}]}, \"synonyms\":{}}");

	add("sullenness", "{\"term\":\"sullenness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|sullen|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being sullen\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The result or product of being sullen\", \"priority\":2}]}, \"synonyms\":{}}");

	add("sultana", "{\"term\":\"sultana\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Italian\"], \"text\":\"1580s, Italian {{m|it|sultana}}, feminine of {{m|it|sultano}}. Displaced existing {{m|en|sultaness}}.\u0026lt;ref\u0026gt;{{R:Online Etymology Dictionary}}\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"File:Vera Effigies Turcorvm Imperatoris Ibrahim Filii, Et Sultanæ, Eiusdem Matris thumb|upright|A 1707 engraving of Sultana Zaffira, said to be one of the wives of the Ottoman Ottoman sultan\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A pale yellow raisin made from a seedless grap\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A female sultan or wife of a sultan\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }